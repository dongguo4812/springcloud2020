package com.dongguo.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Dongguo
 * @date 2021/7/21 0021 15:32
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}