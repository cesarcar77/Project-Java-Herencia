Project-Java-Herencia: Componentes Vehiculares
Este proyecto demuestra la aplicación del concepto de Herencia en Java mediante la construcción de una jerarquía de clases para modelar diversos componentes de un vehículo.

Jerarquía de Clases
Se define una clase base (ComponenteVehicular) que establece los atributos y el comportamiento común, y varias subclases que heredan de ella, especializando su funcionalidad y añadiendo métodos únicos.
Clase Base:
ComponenteVehicular: Define codigo y fabricante, y el método mostrarInformacion().

Clases Derivadas (Subclases):
Motor: Atributos (cilindros, potencia). Comportamiento: encenderMotor().
Transmision: Atributos (tipo, marchas). Comportamiento: cambiarMarcha(int).
Neumatico: Atributos (tamaño, presion). Comportamiento: verificarPresion().
Chasis: Atributos (tipo, peso). Comportamiento: calcularCargaMaxima().
SistemaFrenos: Atributos (tieneABS, tipoDiscos). Comportamiento: verificarABS().

Cada subclase sobrescribe el método mostrarInformacion()para incluir sus detalles específicos.

Salida de Ejecución

A continuación, se presenta una captura de la ejecución del programa, donde se evidencia la correcta instanciación de cada componente y la invocación tanto de los métodos heredados como de los particulares.

<img width="983" height="641" alt="image" src="https://github.com/user-attachments/assets/7792335b-7751-441a-81a9-9a316a47fe3f" />


![alt text](image.png)
