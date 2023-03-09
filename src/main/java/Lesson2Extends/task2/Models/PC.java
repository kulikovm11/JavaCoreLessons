package Lesson2Extends.task2.Models;

import Lesson2Extends.task2.enums.CPU;
import Lesson2Extends.task2.enums.GPU;
import Lesson2Extends.task2.enums.RAM;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class PC {

    int price;
    CPU cpu;
    String series;
    GPU gpu;
    String type;
    RAM ram;
    int ram_volume;

}
