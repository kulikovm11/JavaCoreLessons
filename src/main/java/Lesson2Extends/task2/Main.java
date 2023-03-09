package Lesson2Extends.task2;

import Lesson2Extends.task2.Models.Ultrabook;
import Lesson2Extends.task2.enums.CPU;
import Lesson2Extends.task2.enums.GPU;
import Lesson2Extends.task2.enums.RAM;

public class Main {
    public static void main(String[] args) {

        Ultrabook ultrabook = new Ultrabook(45000, CPU.INTEL,"i5", GPU.NVIDIA,"GTX", RAM.DDR4,16,15,"plastic","ACER");
        System.out.println(ultrabook);

    }
}
