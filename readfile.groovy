import java.nio.file.Paths
import java.nio.file.Files

def path = Paths.get("data.txt")
def lines = Files.readAllLines(path)

lines.each {line -> println line}