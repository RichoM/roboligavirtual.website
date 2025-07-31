# Reglamento de Sumo Robótico Virtual
 
El objetivo del encuentro es sacar al contendiente del dohyo (en el simulador, el círculo negro con el borde blanco) en un lapso de 2:30 minutos. Los equipos usarán un robot de iguales características, que contará con dos sensores de distancia, un sensor de color, dos sensores de tacto en la parte trasera, y dos motores ubicados uno a cada lado. Según lo deseen, podrán personalizar el robot modificando la posición y rotación de los sensores de distancia y de color, o usar el robot estándar.
 
El simulador Webots soporta la programación de robots usando una variedad de lenguajes, entre ellos C, C++, Java, y Python. Para esta competencia, sin embargo, se usará exclusivamente el lenguaje de programación Python en su versión 3.12. Asimismo, para facilitar la programación se proveerá un entorno de programación visual diseñado especialmente para esta competencia. Este editor permitirá generar el código en Python a partir de bloques. 
 
Cualquier duda rogamos enviarla a roboligavirtual@gmail.com.
 
Las características de la competencia con las siguientes:
 
* Se establecen tres categorías de competencia: 
  1. Categoría Infantil: para equipos cuyo participante de mayor edad tenga a lo sumo 12 años el 01/07/2024. Ningún participante puede tener menos de 9 años al 01/07/2024.
  2. Categoría Juvenil: para equipos cuyo participante de mayor edad tenga a lo sumo 18 años el 01/07/2024.
  3. Categoría Libre:  para equipos de cualquier edad (pueden anotarse en esta categoría aunque cumplan con los requisitos de alguna de las otras dos)

* __Cada integrante sólo puede formar parte de un equipo.__

* Se considera que un robot ha sido sacado del dohyo cuando su distancia al centro del mismo supera un determinado umbral indicado en el piso mediante una línea blanca. La plataforma de simulación se encarga de validar este punto de forma automática. 
 
* La plataforma de simulación llevará automáticamente la cuenta de segundos sin movimiento de cada robot. Si el contador de alguno de los robots llegara a los 20 segundos, ese robot quedará automáticamente descalificado. Si, en cambio, el contador de alguno de los robots llegara a 15 segundos y la diferencia con el contador del oponente es menor o igual a 3 segundos, se procederá a reubicar a los robots en distintas posiciones dentro del dohyo de forma automática.
 
* Se producirá un empate si la partida finalizara sin que ninguno de los robots hubiera salido del dohyo o si ambos robots salieran del dohyo en el mismo ciclo de simulación. Ambos casos son detectados de forma automática por el ambiente de simulación.
 
* Todos los programas de los equipos podrán ser examinados por el jurado antes de su posterior ejecución en el simulador. Si durante esta inspección del código o durante la ejecución de la prueba se descubrieran acciones que atenten contra el espíritu de la competencia el jurado podrá descalificar al equipo. Ejemplos de acciones que puedan llevar a una descalificación incluyen: no ejecutar el step de la simulación, alterar el entorno de ejecución accediendo a recursos del sistema ajenos al simulador, comunicarse con sistemas externos, etc. 

## Entrega de equipos

La entrega de los equipos debe realizarse de una de las siguientes formas:

1. Si compite con el robot estándar, con un UNICO archivo de extensión .py.
2. Si compute con un robot personalizado, con DOS archivos. Uno de extensión .py, y el otro de extensión .json. 
 
Estos equipos deben entregarse dentro de una carpeta de Google Drive QUE SE TE INFORMARÁ EL DÍA 31/08/2024. Todos los sábados a las 0:00 un sistema automático levantará el primer archivo .py que encuentre dentro de esa carpeta, y si hay personalización, el primer .json. Asegúrense de que hay un único archivo de cada extensión para que lo levante correctamente. _Aquellos equipos que no tengan archivos subidos para la primera ronda, quedarán automáticamente fuera de la competencia. __Por lo tanto, es fundamental que subas tu equipo.___

___Por lo tanto, cada semana puedes modificar tu código para competir en la ronda correspondiente. ¡No importa si te fue mal en una ronda, la próxima tienes revancha!___

## Puntaje
 
Para determinar el orden en la tabla, cada equipo recibirá 3 puntos por lucha ganada, 1 punto si hay empate y 0 si es derrotado. Una vez finalizada la ronda, 8 equipos clasifican para la ronda final, ingresando en primer lugar los que terminen en el primer puesto de la tabla, luego los mejores segundos y así sucesivamente hasta completar los 8 equipos.  

## Ronda final

Cada partida será al mejor puntaje en un total de 3 luchas. En la primera lucha, el equipo A competirá con el robot rojo y el B con el verde, invirtiéndose en la segunda lucha. Si al finalizar esta segunda lucha queda definido un ganador, no se ejecutará la tercera. Si se llegara a ejecutar, tendrá la misma disposición de colores que la primera. Si al finalizar las 3 luchas quedaran empatados en puntos, pasará a la siguiente ronda el que haya sacado un mayor promedio de puntos por partida en la etapa clasificatoria. De continuar el empate, el jurado determinará quién pasa a la siguiente ronda analizando cualitativamente el comportamiento de cada equipo. 