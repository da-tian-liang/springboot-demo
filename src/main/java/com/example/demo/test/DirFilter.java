package com.example.demo.test;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Author: fl
 * Description: 数据处理
 * Date: 2021/3/18
 */
public class DirFilter implements FilenameFilter {

    private Pattern pattern;

    public DirFilter (String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
