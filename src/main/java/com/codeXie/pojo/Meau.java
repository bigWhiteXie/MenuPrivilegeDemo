package com.codeXie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meau {
    private Integer mid;
    private String mname;
    private String murl;
    private Integer parentid;
    private String mdesc;
    private Integer state;

}
