/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package my.demo.app;

import my.demo.list.LinkedList;

import static my.demo.utilities.StringUtils.join;
import static my.demo.utilities.StringUtils.split;
import static my.demo.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
