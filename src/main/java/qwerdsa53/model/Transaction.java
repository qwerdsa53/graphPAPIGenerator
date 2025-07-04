package qwerdsa53.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    private Long id;
    private User sender;
    private User receiver;
    private BigDecimal amount;
    private TransactionType type;
    private OffsetDateTime createdAt;
}