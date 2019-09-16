package c.c.k;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("c.c.k")
@EnableDiscoveryClient
@EnableDistributedTransaction
public class TxlcnUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(TxlcnUserApplication.class, args);
    }
}
