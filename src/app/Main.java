package app;

import modelo.personas.Empleado;
import modelo.personas.Cliente;
import modelo.personas.Colaboradora;
import modelo.personas.Proveedor;

import modelo.productos.UnidadMedida;
import modelo.productos.Retazo;
import modelo.productos.LimpionCortado;
import modelo.productos.LimpionTerminado;
import modelo.productos.Stock;

import modelo.transacciones.Compra;
import modelo.transacciones.DetalleCompra;
import modelo.transacciones.Venta;
import modelo.transacciones.DetalleVenta;

import modelo.operaciones.EntregaRetazos;
import modelo.operaciones.DevolucionLimpiones;
import modelo.operaciones.Movimiento;
import modelo.operaciones.RendimientoColaboradora;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {

                System.out.println("\n==================== EMPLEADOS ====================\n");

                // Usando constructor vacío
                Empleado emp1 = new Empleado();

                emp1.setIdEmpleado(1);
                emp1.setNombre("Ana");
                emp1.setApellido("Gomez");
                emp1.setCorreo("ana@empresa.com");
                emp1.setCargo("Administradora");
                emp1.setDocumentoIdentidad("123456789");

                emp1.mostrarEmpleado();

                System.out.println("\n---------------------------------------------------\n");

                // Usando constructor con parámetros
                Empleado emp2 = new Empleado(
                                2,
                                "Carlos",
                                "Ramirez",
                                "carlos@empresa.com",
                                "Supervisor",
                                "987654321");

                emp2.mostrarEmpleado();

                System.out.println("\n================== COLABORADORAS ==================\n");

                Colaboradora col1 = new Colaboradora();

                col1.setIdColaboradora(1);
                col1.setNombre("Maria");
                col1.setApellido("Lopez");
                col1.setDireccion("Bogotá");
                col1.setDocumentoIdentidad("11223344");
                col1.setTelefono("3001234567");

                col1.mostrarColaboradora();

                System.out.println("\n---------------------------------------------------\n");

                Colaboradora col2 = new Colaboradora(
                                2,
                                "Luisa",
                                "Martinez",
                                "Soacha",
                                "99887766",
                                "3119876543");

                col2.mostrarColaboradora();

                System.out.println("\n==================== PROVEEDORES ==================\n");

                Proveedor prov1 = new Proveedor();

                prov1.setIdProveedor(1);
                prov1.setRazonSocial("Textiles Andinos");
                prov1.setDocumentoIdentidad("900123456");
                prov1.setCorreo("contacto@textiles.com");
                prov1.setContacto("Juan Perez");
                prov1.setTelefono("3004567890");
                prov1.setDireccion("Bogotá");
                prov1.setFechaRegistro(new Timestamp(System.currentTimeMillis()));

                prov1.mostrarProveedor();

                System.out.println("\n---------------------------------------------------\n");

                Proveedor prov2 = new Proveedor(
                                2,
                                "Algodones del Valle",
                                "900987654",
                                "ventas@algodones.com",
                                "Maria Torres",
                                "3115558899",
                                "Cali",
                                new Timestamp(System.currentTimeMillis()));

                prov2.mostrarProveedor();

                System.out.println("\n====================== CLIENTES ===================\n");

                Cliente cli1 = new Cliente();

                cli1.setIdCliente(1);
                cli1.setNombre("Laura");
                cli1.setApellido("Gonzalez");
                cli1.setDocumentoIdentidad("12345678");
                cli1.setCorreo("laura@email.com");
                cli1.setTelefono("3001112233");
                cli1.setDireccion("Bogotá");
                cli1.setCiudad("Bogotá");
                cli1.setFechaRegistro(new Timestamp(System.currentTimeMillis()));

                cli1.mostrarCliente();

                System.out.println("\n---------------------------------------------------\n");

                Cliente cli2 = new Cliente(
                                2,
                                "Pedro",
                                "Martinez",
                                "87654321",
                                "pedro@email.com",
                                "3119998888",
                                "Medellín",
                                "Medellín",
                                new Timestamp(System.currentTimeMillis()));

                cli2.mostrarCliente();

                System.out.println("\n====================== PRODUCTOS ==================\n");

                UnidadMedida unidad1 = new UnidadMedida(
                                1,
                                "Kilogramo",
                                "kg");

                unidad1.mostrarUnidadMedida();

                System.out.println("\n---------------------------------------------------\n");

                Retazo retazo1 = new Retazo(
                                1,
                                unidad1,
                                "Retazo algodón",
                                "retazo",
                                "Retazos de tela reciclada",
                                "Azul",
                                2.5);

                retazo1.mostrarRetazo();

                System.out.println("\n---------------------------------------------------\n");

                LimpionCortado cortado1 = new LimpionCortado(
                                2,
                                unidad1,
                                "Limpión cortado estándar",
                                "limpion_cortado",
                                "Limpión listo para coser",
                                "40x40 cm",
                                350);

                cortado1.mostrarLimpionCortado();

                System.out.println("\n---------------------------------------------------\n");

                LimpionTerminado terminado1 = new LimpionTerminado(
                                3,
                                unidad1,
                                "Limpión terminado",
                                "limpion_terminado",
                                "Producto final para venta",
                                "Paquete de 12 unidades",
                                25000);

                terminado1.mostrarLimpionTerminado();

                System.out.println("\n======================== STOCK ====================\n");

                Stock stock1 = new Stock();

                stock1.setIdStock(1);
                stock1.setProducto(retazo1);
                stock1.setCantidadDisponible(150);
                stock1.setPuntoReorden(30);
                stock1.setUbicacion("Bodega A");
                stock1.setActualizadoEn(new Timestamp(System.currentTimeMillis()));

                stock1.mostrarStock();

                System.out.println("\n---------------------------------------------------\n");

                Stock stock2 = new Stock(
                                2,
                                cortado1,
                                200,
                                50,
                                "Bodega B",
                                new Timestamp(System.currentTimeMillis()));

                stock2.mostrarStock();

                System.out.println("\n======================== COMPRAS ==================\n");

                DetalleCompra det1 = new DetalleCompra();

                det1.setIdDetalleCompra(1);
                det1.setProducto(retazo1);
                det1.setCantidad(100);
                det1.setCostoUnitario(2000);
                det1.calcularSubtotal();

                det1.mostrarDetalleCompra();

                System.out.println("\n---------------------------------------------------\n");

                DetalleCompra det2 = new DetalleCompra(
                                2,
                                null,
                                cortado1,
                                50,
                                3000);

                det2.calcularSubtotal();
                det2.mostrarDetalleCompra();

                System.out.println("\n---------------------------------------------------\n");

                List<DetalleCompra> listaDetalles = new ArrayList<>();
                listaDetalles.add(det1);
                listaDetalles.add(det2);

                Compra compra1 = new Compra();

                compra1.setIdCompra(1);
                compra1.setProveedor(prov1);
                compra1.setFechaCompra(new Timestamp(System.currentTimeMillis()));
                compra1.setTotalCompra(350000);
                compra1.setEstadoCompra("pendiente");
                compra1.setDetalles(listaDetalles);

                compra1.mostrarCompra();

                System.out.println("\n---------------------------------------------------\n");

                Compra compra2 = new Compra(
                                2,
                                prov2,
                                new Timestamp(System.currentTimeMillis()),
                                150000,
                                "pagada",
                                listaDetalles);

                compra2.mostrarCompra();

                System.out.println("\n========================= VENTAS ==================\n");

                DetalleVenta detVenta1 = new DetalleVenta();

                detVenta1.setIdDetalleVenta(1);
                detVenta1.setProducto(terminado1);
                detVenta1.setCantidad(20);
                detVenta1.setPrecioUnitario(25000);

                detVenta1.calcularSubtotal();
                detVenta1.mostrarDetalleVenta();

                System.out.println("\n---------------------------------------------------\n");

                DetalleVenta detVenta2 = new DetalleVenta(
                                2,
                                null,
                                cortado1,
                                10,
                                18000);

                detVenta2.calcularSubtotal();
                detVenta2.mostrarDetalleVenta();

                List<DetalleVenta> listaDetallesVenta = new ArrayList<>();
                listaDetallesVenta.add(detVenta1);
                listaDetallesVenta.add(detVenta2);

                Venta venta1 = new Venta();

                venta1.setIdVenta(1);
                venta1.setCliente(cli1);
                venta1.setTotalVenta(680000);
                venta1.setEstadoVenta(Venta.EstadoVenta.pendiente);
                venta1.setFechaVenta(new Timestamp(System.currentTimeMillis()));
                venta1.setDetalles(listaDetallesVenta);

                venta1.mostrarVenta();

                System.out.println("\n---------------------------------------------------\n");

                Venta venta2 = new Venta(
                                2,
                                cli2,
                                430000,
                                Venta.EstadoVenta.pagada,
                                new Timestamp(System.currentTimeMillis()));

                venta2.setDetalles(listaDetallesVenta);
                venta2.mostrarVenta();

                System.out.println("\n======================= OPERACIONES ===============\n");

                EntregaRetazos entrega1 = new EntregaRetazos();

                entrega1.setIdEntrega(1);
                entrega1.setProducto(retazo1);
                entrega1.setEmpleado(emp1);
                entrega1.setColaboradora(col1);
                entrega1.setCantidadEntregada(80);
                entrega1.setFechaEntrega(new Timestamp(System.currentTimeMillis()));

                entrega1.mostrarEntregaRetazos();

                System.out.println("\n---------------------------------------------------\n");

                EntregaRetazos entrega2 = new EntregaRetazos(
                                2,
                                retazo1,
                                emp2,
                                col2,
                                120,
                                new Timestamp(System.currentTimeMillis()));

                entrega2.mostrarEntregaRetazos();

                System.out.println("\n---------------------------------------------------\n");

                DevolucionLimpiones devolucion1 = new DevolucionLimpiones();

                devolucion1.setIdDevolucion(1);
                devolucion1.setColaboradora(col1);
                devolucion1.setEmpleado(emp1);
                devolucion1.setProducto(cortado1);
                devolucion1.setCantidadDevuelta(70);
                devolucion1.setFechaDevolucion(new Timestamp(System.currentTimeMillis()));

                devolucion1.mostrarDevolucionLimpiones();

                System.out.println("\n---------------------------------------------------\n");

                DevolucionLimpiones devolucion2 = new DevolucionLimpiones(
                                2,
                                col2,
                                emp2,
                                cortado1,
                                110,
                                new Timestamp(System.currentTimeMillis()));

                devolucion2.mostrarDevolucionLimpiones();

                System.out.println("\n---------------------------------------------------\n");

                Movimiento mov1 = new Movimiento();

                mov1.setIdMovimiento(1);
                mov1.setEmpleado(emp1);
                mov1.setProducto(retazo1);
                mov1.setTipoMov(Movimiento.TipoMovimiento.entrada);
                mov1.setCantidad(100);
                mov1.setMotivo("Compra de retazos");
                mov1.setFechaMov(new Timestamp(System.currentTimeMillis()));

                mov1.mostrarMovimiento();

                System.out.println("\n---------------------------------------------------\n");

                Movimiento mov2 = new Movimiento(
                                2,
                                emp2,
                                cortado1,
                                Movimiento.TipoMovimiento.salida,
                                50,
                                "Entrega a colaboradora",
                                new Timestamp(System.currentTimeMillis()));

                mov2.mostrarMovimiento();

                System.out.println("\n====================== RENDIMIENTO =================\n");

                RendimientoColaboradora rend1 = new RendimientoColaboradora();

                rend1.setIdRendimiento(1);
                rend1.setColaboradora(col1);
                rend1.setEntrega(entrega1);
                rend1.setDevolucion(devolucion1);
                rend1.setFechaRegistro(new Timestamp(System.currentTimeMillis()));

                rend1.setCantidadEntregada(80);
                rend1.setCantidadDevuelta(70);

                rend1.calcularPorcentajePerdida();
                rend1.mostrarRendimiento();

                System.out.println("\n---------------------------------------------------\n");

                RendimientoColaboradora rend2 = new RendimientoColaboradora(
                                2,
                                col2,
                                entrega2,
                                devolucion2,
                                new Timestamp(System.currentTimeMillis()),
                                120,
                                110);

                rend2.calcularPorcentajePerdida();
                rend2.mostrarRendimiento();
        }
}