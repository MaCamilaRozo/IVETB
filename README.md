# IVETB – Sistema de Gestión de Producción y Ventas

## 1. Descripción del Proyecto

Este proyecto consiste en el desarrollo de un sistema en **Java** para gestionar las operaciones principales de la empresa IVETB.
El sistema permite administrar personas, productos, transacciones y operaciones relacionadas con la producción y comercialización de limpiones elaborados a partir de retazos.

El objetivo del proyecto es aplicar conceptos de **programación orientada a objetos**, organización por **paquetes**, uso de **constructores**, **getters y setters**, y manejo de **colecciones** en Java.

---

## 2. Funcionalidades del Sistema

El sistema permite gestionar las siguientes entidades:

### Personas

* Empleados
* Colaboradoras
* Clientes
* Proveedores

### Productos

* Retazos
* Limpiones cortados
* Limpiones terminados
* Stock
* Unidad de medida

### Transacciones

* Compras
* Detalle de compras
* Ventas
* Detalle de ventas

### Operaciones

* Entrega de retazos a colaboradoras
* Devolución de limpiones
* Movimientos de inventario
* Rendimiento de colaboradoras

---

## 3. Estructura del Proyecto

El proyecto está organizado en paquetes para separar responsabilidades.

```
src
│
├── app
│   └── Main.java
│
└── modelo
    ├── personas
    │   ├── Empleado.java
    │   ├── Cliente.java
    │   ├── Colaboradora.java
    │   └── Proveedor.java
    │
    ├── productos
    │   ├── UnidadMedida.java
    │   ├── Retazo.java
    │   ├── LimpionCortado.java
    │   ├── LimpionTerminado.java
    │   └── Stock.java
    │
    ├── transacciones
    │   ├── Compra.java
    │   ├── DetalleCompra.java
    │   ├── Venta.java
    │   └── DetalleVenta.java
    │
    └── operaciones
        ├── EntregaRetazos.java
        ├── DevolucionLimpiones.java
        ├── Movimiento.java
        └── RendimientoColaboradora.java
```

---

## 4. Tecnologías Utilizadas

* Java
* Programación Orientada a Objetos (POO)
* Colecciones (`ArrayList`)
* Manejo de paquetes (`package`)
* Terminal / línea de comandos

---

## 5. Cómo Ejecutar el Proyecto

1. Abrir la terminal.
2. Ir a la carpeta `src` del proyecto.

```
cd ruta/del/proyecto/src
```

3. Compilar el proyecto.

```
javac app/Main.java
```

4. Ejecutar el programa.

```
java app.Main
```

---

## 6. Ejecución del Programa

El archivo `Main.java` contiene ejemplos de creación y uso de objetos del sistema, incluyendo:

* Creación de personas
* Registro de compras
* Registro de ventas
* Entrega de retazos
* Devolución de limpiones
* Registro de movimientos de inventario
* Cálculo del rendimiento de colaboradoras

Los resultados se muestran en la consola mediante métodos de impresión.

---

## 7. Autor

Nombre del estudiante:
Programa académico:
Institución:
Fecha de entrega:

---

## 8. Objetivo Académico

Este proyecto fue desarrollado como parte del aprendizaje de **Programación en Java**, con el objetivo de aplicar conceptos de:

* Modelado de clases
* Encapsulamiento
* Constructores
* Relaciones entre objetos
* Organización de código en paquetes
* Simulación de operaciones empresariales
