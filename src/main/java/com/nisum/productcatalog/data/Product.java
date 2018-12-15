package com.nisum.productcatalog.data;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by NIS1563-MBP on 12/14/18.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    private int id;
    private String name;
}
