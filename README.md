Al hacer solo 10 el resultado va a ser casi siempre 20 pero al aumentar el recorrido tiende a fallar ya que ambas tambien corren al mismo
momento llegando a causar problemas


==========================================================================================================================================
ejercicio 3 README (para ver los cambios)
Para solucionarlo, sincronizamos el set y el get con synchronized, así solo un hilo puede acceder a la variable a la vez. También añadimos una variable booleana "disponible" que indica si hay un valor nuevo pendiente de leer: el escritor solo escribe cuando el anterior ya se leyó, y el lector solo lee cuando hay algo nuevo. Se coordinan con wait() y notifyAll(): si el escritor se encuentra con un valor sin leer, espera; si el lector no tiene nada nuevo, también espera. Después de cada operación se avisa al otro hilo. La condición la comprobamos con un while en vez de un if, porque un hilo puede despertarse sin motivo o con el estado ya cambiado. Y como wait() puede lanzar InterruptedException, los métodos lo declaran con throws y la hebra lo captura, restaurando la interrupción con Thread.currentThread().interrupt().
