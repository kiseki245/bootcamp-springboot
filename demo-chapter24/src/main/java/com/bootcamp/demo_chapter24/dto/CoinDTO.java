package com.bootcamp.demo_chapter24.dto;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class CoinDTO {

  private String id;
  private String symbol;
  private String name;
  private String image;
  @JsonProperty("current_price")
  private Double currentPrice;
  @JsonProperty("market_cap")
  private Long marketCap;
  @JsonProperty("last_updated")
  private LocalDate lastupdate;
  @JsonProperty("price_change_percentage_24h")
  private Double priceChangePercentage24h;
    // private double marketCapChange24h;
    private double marketCapChangePercentage24h;
    // private double circulatingSupply;
    // private double totalSupply;
    // private Double maxSupply;
    // private double ath;
    // private double athChangePercentage;
    // private String athDate;
    // private double atl;
    // private double atlChangePercentage;
    // private String atlDate;
    // private Object roi;
    // private String lastUpdated;

  }

