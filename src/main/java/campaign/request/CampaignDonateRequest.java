package campaign.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CampaignDonateRequest {
    Long id;

    PageRequest pageRequest;
}