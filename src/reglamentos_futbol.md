
# Reglamento de Fútbol Robótico Virtual
 
__Este conjunto de reglas se utilizará únicamente para la competencia Roboliga Virtual 2024__

### 1. JUEGO
 
#### 1.1. Procedimiento del juego y duración de un juego

Los partidos de fútbol de robots consisten en dos equipos de robots que juegan fútbol uno contra el otro. Cada equipo tiene tres robots autónomos. El juego constará de un único tiempo de 5 minutos. Las rondas serán organizadas para distribuir lo más equitativamente posible el color con el que juega cada equipo.

El juego será cronometrado por un programa de árbitro artificial. El árbitro tomará todas las decisiones durante el juego automáticamente, incluyendo la colocación de la pelota y de los robots. No habrá discusión sobre las decisiones que tomó el árbitro artificial.

#### 1.2. Programación previa al partido

Los equipos enviarán su código al comité organizador (CO) antes de la competencia. Luego, los partidos serán dirigidos por el CO, que ejecutará el código de los equipos entre sí. Los partidos serán pregrabados o transmitidos en vivo a través de un servicio de transmisión en línea.

#### 1.3. Reunión previa al partido

Al comienzo del partido, el árbitro artificial elegirá al azar el equipo que realizará el saque inicial, así como la meta hacia la que pateará. 

#### 1.4. Patada inicial

Cada mitad del juego comienza con un saque inicial. Todos los robots serán colocados por el árbitro artificial en su propio lado del campo y detenidos. El balón es colocado por el árbitro artificial en el centro del campo. Todos los robots del equipo que no pateen estarán fuera del círculo central.

A la orden del árbitro artificial, todos los robots se iniciarán inmediatamente.

#### 1.5. Interferencia humana

Excepto para iniciar o detener la simulación, no se permite la interferencia humana durante los partidos simulados, ni por parte de los equipos ni por parte del CO. Todas las decisiones y acciones son tomadas por los programas de los robots y el árbitro artificial de forma autónoma.

#### 1.6. Movimiento de la bola

Un robot no puede sostener la pelota.

#### 1.7. Puntuación

El árbitro artificial considerará que se ha marcado un gol tan pronto como el balón cruce la línea de meta.

Los goles marcados por un robot atacante o defensor tienen el mismo resultado final: dan un gol al equipo del lado contrario. Después de un gol, el juego se reiniciará con un saque del medio del equipo contra el que se marcó.

#### 1.8. Dentro del Área de Penalización

Se supone que ningún robot debe estar dentro de cualquier área de penalización durante más de 15 segundos. Después de este tiempo, volverán a aparecer en un punto neutral desocupado. Para que se aplique esta regla, un robot debe estar dentro del área penal con su centro de masa.

Para que el cronómetro se reinicie, los robots deben estar fuera del área penal durante más de 2 segundos.

#### 1.9. Falta de progreso

La falta de progreso ocurre si no hay progreso en el juego durante un período de tiempo razonable. Las situaciones típicas de falta de progreso son cuando la pelota está atascada entre los robots, cuando no hay cambios en las posiciones de la pelota y del robot, o cuando la pelota está más allá de la capacidad de detección o alcance de todos los robots en el campo.

Si no se produce un movimiento significativo del balón durante 10 segundos, el árbitro artificial señalará "falta de progreso" y moverá el balón a un punto neutral desocupado al azar. Si esto no soluciona la falta de progreso, el árbitro puede mover la pelota a un punto neutral diferente.

#### 1.10. Saque lateral

No existe una regla de "saque lateral".

Si la pelota o cualquier robot abandona accidentalmente el campo de juego, se volverá a poner en juego inmediatamente y se colocará en el campo de acuerdo con las reglas de la Regla 1.9, "Falta de progreso" .

#### 1.11. Robots dañados

A veces, los robots de la simulación se vuelcan o se caen. En cualquier caso, cuando un robot no se mueve durante 15 segundos, el árbitro artificial lo reubicará en un punto neutral desocupado.

#### 1.12. Interrupción del Juego

En principio, no se detendrá el juego.

### 2. EQUIPO

#### 2.1. Reglamento

Un equipo debe tener de uno a tres miembros humanos para participar de la Roboliga Virtual. Los miembros del equipo y/o los programas no se pueden compartir entre equipos.

Cada equipo debe tener un capitán . El capitán es la persona responsable de la comunicación con el CO. El capitán del equipo debe estar en condiciones de responder a todas las solicitudes y preguntas del CO. El equipo puede reemplazar a su capitán durante la competencia.

#### 2.2. Violaciones

Los equipos que no cumplan con las reglas no podrán participar.

### 3. ROBOTS

#### 3.1. Cambio de programa controlador

Está prohibido el cambio de programa en el medio de un partido. Sí se podrá cambiar entre rondas durante la etapa clasificatoria.

#### 3.2. Control de robots

Los equipos escribirán un programa controlador para mover los robots durante la simulación. Los robots simulados tienen dos ruedas para controlar su movimiento (una a cada lado - transmisión diferencial). El único aspecto de la simulación sobre el que el programa puede actuar es la velocidad de las ruedas del robot que está controlando. 

#### 3.3. Interferencia

Los equipos no pueden interferir con la simulación de ninguna manera no oficial. Los equipos pueden ser penalizados o descalificados por el CO por cualquier intento de influenciar o evitar el árbitro artificial, los robots de otros equipos o las limitaciones del mundo de simulación.

#### 3.4. Comunicación

Los robots pueden comunicarse dentro de cada equipo en el ámbito de la simulación, siempre que cumplan con la regla Regla 3.3, "Interferencia" .

#### 3.5. Estructura de los robots

La construcción de los robots está predefinida y forma parte del mundo de la simulación. Los robots tendrán forma cúbica, dos ruedas motorizadas y sin pateador.

Los robots se pueden programar con un script de controlador. Pueden girar en cualquier dirección, así como avanzar y retroceder en cualquier parte del campo. Hay una velocidad máxima definida por la simulación. 

### 4. CÓDIGO DE CONDUCTA

#### 4.1. Juego limpio

Se espera que el objetivo de todos los equipos sea jugar un juego limpio y justo de fútbol de robots. No se permite que los programas interfieran con otros robots o con el árbitro durante el juego normal. No se permite que los programas causen interferencia en el campo o en la pelota durante el juego normal.

#### 4.2. Intercambio

Es parte del espíritu de la Roboliga que cualquier desarrollo tecnológico y curricular se comparta entre los participantes al finalizar el torneo.

Además, si encuentra algún error en el mundo de la simulación o en el árbitro artificial, háganoslo saber.

#### 4.3. Violaciones / Descalificación

Los equipos que violen el código de conducta pueden ser descalificados del torneo. También es posible descalificar a una sola persona o un solo programa para que no siga participando en el torneo.

En casos menos severos de violaciones del código de conducta, un equipo recibirá una advertencia (una tarjeta amarilla). En casos severos o repetidos de violaciones del código de conducta, un equipo puede ser descalificado inmediatamente sin advertencia mediante una tarjeta roja.

### 5. RESOLUCIÓN DE CONFLICTOS

#### 5.1. Árbitro artificial

Durante un partido, el árbitro artificial es un programa encargado de tomar decisiones con respecto al juego y de acuerdo con estas reglas. Durante el juego, las decisiones tomadas por el árbitro artificial son definitivas. Al final del juego, el resultado registrado es definitivo.

#### 5.2. Aclaración de reglas

Los miembros del Comité Técnico y del Comité Organizador de Roboliga pueden aclarar las reglas, si es necesario, incluso durante un torneo.

#### 5.3. Modificación de una regla

Si ocurren circunstancias especiales, como problemas imprevistos o capacidades de un robot, las reglas pueden ser modificadas por el Presidente del Comité Organizador de Roboliga junto con los miembros disponibles del Comité Técnico y del Comité Organizador, si es necesario incluso durante un torneo.

### 6. INSTANCIAS FINALES

#### 6.1. Entrevistas

Durante las instancias finales, el CO puede coordinar entrevistas a los equipos durante el evento. El horario exacto será publicado por el Comité Organizador antes del evento.

Durante una entrevista, al menos un miembro de cada equipo debe poder explicar particularidades sobre los robots del equipo, especialmente en lo que respecta a su estrategia y su programación. Un entrevistador puede pedirle al equipo una demostración. El entrevistador también puede pedirle al equipo que escriba un programa simple durante la entrevista para verificar que el equipo pueda programar su robot.
 
---

### Entrega de equipos
 
La entrega de los equipos debe realizarse mediante un archivo .zip que contenga el código fuente y todos los elementos necesarios para la ejecución del programa en el lenguaje seleccionado. NO DEBE HABER NINGÚN ARCHIVO BINARIO EJECUTABLE DENTRO DEL .ZIP.
 
Estos equipos deben entregarse dentro de la carpeta de Google Drive que ___SERÁ INFORMADA EL DÍA 31/08/2024___. El sistema automático levantará el primer archivo .zip que encuentre dentro de esa carpeta. Asegúrense de que hay un único archivo para que lo levante correctamente. 

___Aquellos equipos que no tengan archivos subidos para la primera ronda, quedarán automáticamente fuera de la competencia. Por lo tanto, es fundamental que subas tu equipo.___

___Por otra parte, cada semana puedes modificar tu código para competir en la ronda correspondiente. ¡No importa si te fue mal en una ronda, la próxima tienes revancha!___
 
### Puntaje

Para determinar el orden en la tabla, cada equipo recibirá 3 puntos por partido ganada, 1 punto si hay empate y 0 si es derrotado. Una vez finalizada la ronda, 8 equipos clasifican para la ronda final, ingresando en primer lugar los que terminen en el primer puesto de la tabla, luego los mejores segundos y así sucesivamente hasta completar los 8 equipos.  
 
### Ronda final

Cada instancia será de eliminación. En este caso, el tiempo será de 5 minutos, pero dividido en dos tiempos de 2:30, con cambio de lado. Si en los 5 minutos, no hay un ganador, se realizará una extensión de 2:30 con la configuración del primer tiempo con gol de oro (es decir, el primero que mete gol, gana). Si se repite el empate, se considerará el coeficiente de puntos obtenidos en la ronda inicial (puntos / cantidad de partidos jugados). Si aún así, se conserva el empate, el jurado decidirá qué equipo es el que pasa a la siguiente ronda, analizando cualitativamente el comportamiento de cada equipo. 