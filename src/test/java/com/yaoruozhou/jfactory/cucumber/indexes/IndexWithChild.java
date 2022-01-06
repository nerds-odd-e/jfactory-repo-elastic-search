package com.yaoruozhou.jfactory.cucumber.indexes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "index_with_child")
public class IndexWithChild {

    @Id
    private String id;

    private ChildBean child;

    @Getter
    @Setter
    public static class ChildBean {
        private String yaString;
    }
}
