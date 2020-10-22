Algoritmo almacen
	Definir existencias como entero
	Definir entregadas como entero
	existencias <- 3200
	Mientras Existencias >= 100 Hacer
		Escribir "Seleccione número de existencias a pedir: "
		Leer entregadas
		existencias = existencias - entregadas
		Escribir "Existencias actuales: " existencias
	FinMientras
	Escribir "No existen existencias disponibles"
FinAlgoritmo
