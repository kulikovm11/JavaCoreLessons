package Lesson2Extends.task2.Models;

import Lesson2Extends.task2.enums.CPU;
import Lesson2Extends.task2.enums.GPU;
import Lesson2Extends.task2.enums.RAM;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Laptop extends PC{

    int screenSize;

    public Laptop(int price, CPU cpu, String series, GPU gpu, String type, RAM ram, int ram_volume, int screenSize) {
        super(price, cpu, series, gpu, type, ram, ram_volume);
        this.screenSize = screenSize;
    }


}
