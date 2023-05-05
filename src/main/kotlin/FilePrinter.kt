import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    // 여기서 경로를 설정
//    fun readFile() {
//        val currentFile = File(".")
//        val file = File(currentFile.absolutePath + "/a.txt")
//        val reader = BufferedReader(FileReader(file))
//        println(reader.readLine())
//        reader.close()
//    }
    // main에서 경로 설정
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}
