package c.c.k;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("c.c.k.biz")
@EnableDiscoveryClient
@EnableDistributedTransaction
@EnableFeignClients
public class TxlcnOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(TxlcnOrderApplication.class, args);
    }
}
