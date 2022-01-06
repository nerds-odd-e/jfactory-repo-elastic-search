package com.yaoruozhou.jfactory.cucumber.indexes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "index")
public class Index {

    @Id
    private String id;

    private String someString;
    private int someInt;
    private boolean someBoolean;

}
