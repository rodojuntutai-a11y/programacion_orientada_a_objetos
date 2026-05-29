class Estudiante(
    val nombre: String,
    val legajo: Int) {
    var calificacion: Double? = null
}

fun estudiante(nombre: String, legajo: Int): Estudiante {
    return Estudiante(nombre, legajo)
}

