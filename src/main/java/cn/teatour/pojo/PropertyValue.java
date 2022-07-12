package cn.teatour.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "property_value")
public class PropertyValue {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer product_id;

    private Integer property_id;

    private String value;

    private Property property;

}