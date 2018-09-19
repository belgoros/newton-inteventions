{
  "document_number" : ${intervention.some_parameter},
  "invoice_number" : ${intervention.some_parameter},
  "is_local" : ${intervention.some_parameter},
  "creation_site" : ${intervention.some_parameter},
  "realisation_site": ${intervention.some_parameter},
  "creation_date": ${intervention.some_parameter},
  "intervention_type":
  "customer_language":
  "deposit_product": {
      "item_code":
      "label":
    },
  "total_theoretical_time":
  "is_total_price_without_taxes":
  "total_price":
  "currency":
  "family_id":
  "services": [<@render partial="service" collection=intervention.getServices() spacer="comma"/> ],
  "spare_parts": [<@render partial="spare_part" collection=intervention.getSpareParts() spacer="comma"/> ],
  "included":[
    {
      "attributes":
        {
          "is_ready_to_print": true,
          "text_to_write": "test test",
          "location": "Back",
          "shape": "Bent",
          "font": "futura"
        },
      "id":"80748",
      "type": "marking_details",
    }
  ],
  "string_tension": 55,
  "author": "LWILLI50",
  "traceability_number": "",
  "max_ogea_amount": 0,
  "sad_purchase_store": null,
  "sad_type": "",
  "diving_serial_number": "" ,
  "states":[<@render partial="state" collection=intervention.getStates() spacer="comma"/> ]
}


