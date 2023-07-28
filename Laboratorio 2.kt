//Anggelie Lizeth Velásquez Asencio 221181
//

fun calcularPromedio(numeros: List<Int>): Double {
    val suma = numeros.reduce { acc, num -> acc + num }
    return suma.toDouble() / numeros.size
}

fun obtenerImpares(lista: List<Int>): List<Int> {
    return lista.filter { it % 2 != 0 }
}

data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)


fun mapToStudent(personList: List<Person>): List<Student> {
    return personList.map { person -> Student(person.name, person.age, person.gender, "ID_${person.name}") }
}
