package com.mars.demo.app.rto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * @author wangyuhan
 * @version 1.0
 * @date 2022/08/13 15:45:44
 * @desc return data object
 */

@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ReturnData {

    private static final int ERROR_CODE = -1;
    private static final int CORRECT_CODE = 0;
    private static final long serialVerisonUID = 233L;

    private Object data;
    private Integer code;
    private String msg;
    private Integer status;

    public ReturnData() {
    }

    public ReturnData(Object data) {
        this.code = CORRECT_CODE;
        this.data = data;
    }

    public static ReturnData newCorrectData(Object data) {
        return new ReturnData(data);
    }

    public static ReturnData newErrorData(Object data) {
        ReturnData returnData = new ReturnData(data);
        returnData.setCode(ERROR_CODE);
        return returnData;
    }
}
