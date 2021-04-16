package edu.greenriver.sdev.cookingtipsmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CookingTip
{
    private String tipType; //cooking, grilling, etc...
    private String tip;
}
