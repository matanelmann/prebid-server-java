package com.iab.openrtb.request;

import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Value;

import java.util.List;

/**
 * This object describes the publisher of the media in which the ad will be
 * displayed. The publisher is typically the seller in an OpenRTB transaction.
 */
@Value
public class Publisher {

    /** Exchange-specific publisher ID. */
    String id;

    /** Publisher name (may be aliased at the publisher’s request). */
    String name;

    /** Array of IAB content categories that describe the publisher. Refer to List 5.1. */
    List<String> cat;

    /** Highest level domain of the publisher (e.g., “publisher.com”). */
    String domain;

    /** Placeholder for exchange-specific extensions to OpenRTB. */
    ObjectNode ext;
}
