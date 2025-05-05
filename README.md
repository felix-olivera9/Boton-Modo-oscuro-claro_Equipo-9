# Boton-Modo-oscuro-claro_Equipo-9
# Componente BotonBlancoYNegro

Un botón personalizado que alterna entre modo claro y oscuro en una interfaz Swing.

## 📋 Descripción
Componente `JButton` personalizado que permite cambiar dinámicamente entre temas claro/oscuro en aplicaciones Java Swing.

## 🎨 Vista previa
![Image](https://github.com/user-attachments/assets/76af399c-aaad-4fee-8dec-bb09da32b7ef) 
![Image](https://github.com/user-attachments/assets/2a93f587-2822-4d5b-99dc-ccd5b84c0215)

## ⚙️ Métodos
```java
BotonBlancoYNegro()
Constructor que configura el botón y añade el ActionListener para cambiar de modo.

void cambiarAModoOscuro(Container contenedor)
Cambia los colores de todos los componentes del contenedor (paneles, botones, etiquetas, campos de texto, etc.) a colores oscuros.

void cambiarAModoClaro(Container contenedor)
Restaura los colores claros predeterminados a todos los componentes del contenedor.
```
## ⚙️ Propiedades
```java
boolean modoOscuro // Estado actual (true = oscuro, false = claro)
```
## Instalación en NetBeans
Abre NetBeans

Ve al Diseñador de GUI (JFrame Form)

Haz clic derecho en la Palette → "Palette Manager"

Haz clic en "Add from JAR..." y selecciona MiBotonModoOscuro.jar

Elige la clase BotonBlancoYNegro

Selecciona o crea una categoría (ej. "Mis Componentes")

Completa el asistente

## Uso
Abre un JFrame Form en modo diseño

Busca el botón en tu categoría de componentes

Arrástralo al formulario

¡Listo! Funcionará automáticamente al hacer clic

## Video explicativo
https://youtu.be/0a2DwSOHcNk
## Creditos del Equipo
Chávez López Jeshua

Olivera Jimenez Felix Eliel
