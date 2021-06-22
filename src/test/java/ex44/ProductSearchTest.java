/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex44;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static ex44.ProductSearch.readJSON;
import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {
    static final String fileName = "exercise44_input.json";
    @Test
    @DisplayName("read from json file")
    void readJSONFileTest(){
        ArrayList<String> json = new ArrayList<>();
        json.add("{\"quantity\":5,\"price\":25.0,\"name\":\"Widget\"}");
        json.add("{\"quantity\":5,\"price\":15.0,\"name\":\"Thing\"}");
        json.add("{\"quantity\":10,\"price\":5.0,\"name\":\"Doodad\"}");


        assertEquals(json, readJSON(fileName));
    }
}