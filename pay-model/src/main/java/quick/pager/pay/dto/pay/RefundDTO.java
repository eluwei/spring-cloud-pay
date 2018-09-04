package quick.pager.pay.dto.pay;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import quick.pager.pay.dto.DTO;

/**
 * 退款actor 数据传输对象
 *
 * @author siguiyang
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class RefundDTO extends DTO {
    private static final long serialVersionUID = -8497155935836417152L;
}
