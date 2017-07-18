package com.heetae;

import java.util.List;

/**
 * Created by hsMacbook on 2017. 7. 17..
 */
public interface Storage {
    List<String> write();
    void read(List<String> savedValues);
}
