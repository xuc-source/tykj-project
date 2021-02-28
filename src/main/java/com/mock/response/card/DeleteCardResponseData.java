package com.mock.response.card;

import com.mock.model.IsvResponseData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 **/
@Getter
@Setter
@ToString
public class DeleteCardResponseData implements IsvResponseData {

    private Boolean isSuccess;

}
