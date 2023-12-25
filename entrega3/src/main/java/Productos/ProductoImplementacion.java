package Productos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoImplementacion {

    private static final String SELECT_BY_ID = "SELECT * FROM productos WHERE idProducto = ?";
    private static final String SELECT_BY_NAME = "SELECT * FROM productos WHERE nombre LIKE ?";
    private static final String SELECT_ALL = "SELECT * FROM productos";
    private static final String INSERT_PRODUCTO = "INSERT INTO productos (idProducto, idCategoria, nombre) VALUES (?, ?, ?)";
    private static final String DELETE_PRODUCTO = "DELETE FROM productos WHERE idProducto = ?";
    private static final String UPDATE_PRODUCTO = "UPDATE productos SET idCategoria = ?, nombre = ? WHERE idProducto = ?";

    public final Connection conexion;

    public ProductoImplementacion(Connection conexion) {
        this.conexion = conexion;
    }

    public Producto buscarProductoPorId(int idProducto) {
        try (PreparedStatement statement = conexion.prepareStatement(SELECT_BY_ID)) {
            statement.setInt(1, idProducto);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Producto producto = new Producto();
                    producto.setIdProducto(resultSet.getInt("idProducto"));
                    producto.setIdCategoria(resultSet.getInt("idCategoria"));
                    producto.setNombre(resultSet.getString("nombre"));

                    return producto;
                }
            }
        } catch (SQLException e) {
            manejarExcepcion("Error al buscar producto por ID", e);
        }
        return null;
    }

    public List<Producto> buscarProductosPorNombre(String nombre) {
        List<Producto> productos = new ArrayList<>();
        try (PreparedStatement statement = conexion.prepareStatement(SELECT_BY_NAME)) {
            statement.setString(1, "%" + nombre + "%");

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Producto producto = new Producto();
                    producto.setIdProducto(resultSet.getInt("idProducto"));
                    producto.setIdCategoria(resultSet.getInt("idCategoria"));
                    producto.setNombre(resultSet.getString("nombre"));
                    productos.add(producto);
                }
            }
        } catch (SQLException e) {
            manejarExcepcion("Error al buscar productos por nombre", e);
        }
        return productos;
    }

    public List<Producto> obtenerTodosLosProductos() {
        List<Producto> productos = new ArrayList<>();
        try (PreparedStatement statement = conexion.prepareStatement(SELECT_ALL);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(resultSet.getInt("idProducto"));
                producto.setIdCategoria(resultSet.getInt("idCategoria"));
                producto.setNombre(resultSet.getString("nombre"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            manejarExcepcion("Error al obtener todos los productos", e);
        }
        return productos;
    }

    public boolean agregarProducto(Producto producto) {
        try (PreparedStatement statement = conexion.prepareStatement(INSERT_PRODUCTO)) {
            statement.setInt(1, producto.getIdProducto());
            statement.setInt(2, producto.getIdCategoria());
            statement.setString(3, producto.getNombre());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            manejarExcepcion("Error al agregar producto", e);
            return false;
        }
    }

    public boolean borrarProducto(int idProducto) {
        try (PreparedStatement statement = conexion.prepareStatement(DELETE_PRODUCTO)) {
            statement.setInt(1, idProducto);

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            manejarExcepcion("Error al borrar producto", e);
            return false;
        }
    }

    public boolean modificarProducto(Producto producto) {
        try (PreparedStatement statement = conexion.prepareStatement(UPDATE_PRODUCTO)) {
            statement.setInt(1, producto.getIdCategoria());
            statement.setString(2, producto.getNombre());
            statement.setInt(3, producto.getIdProducto());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            manejarExcepcion("Error al modificar producto", e);
            return false;
        }
    }

    private void manejarExcepcion(String mensaje, SQLException e) {
        System.err.println(mensaje + ": " + e.getMessage());
        e.printStackTrace();
    }

    public static class Producto {

        private int idProducto;
        private int idCategoria;
        private String nombre;

        // Constructores, getters y setters para los atributos
        // ...

        public int getIdProducto() {
            return idProducto;
        }

        public void setIdProducto(int idProducto) {
            this.idProducto = idProducto;
        }

        public int getIdCategoria() {
            return idCategoria;
        }

        public void setIdCategoria(int idCategoria) {
            this.idCategoria = idCategoria;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}