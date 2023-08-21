fun main() {
    var vocal = 'A'
    //nilai yang digunakan dalam ekspresi cetak akan tetap sama dengan nilai sebelum perubahan.
    println("Vocal " + vocal++) // Mencetak nilai 'A', lalu mengubah nilai vocal menjadi 'B'
    println("Vocal " + vocal++) // Mencetak nilai 'B', lalu mengubah nilai vocal menjadi 'C'
    println("Vocal " + vocal--) // Mencetak nilai 'C', lalu mengubah nilai vocal menjadi 'B'
    println("Vocal " + vocal--) // Mencetak nilai 'B', lalu mengubah nilai vocal menjadi 'A'
    println("Vocal " + vocal--) // Mencetak nilai 'A', lalu mengubah nilai vocal menjadi '?'
}
