curl -X POST http://localhost:8080/qod/v1/sessions -H "Content-Type: application/json" -d '{
  "deviceId": "device123",
  "trafficDescriptors": [{"destinationPort": "1935", "protocol": "UDP"}],
  "qodRequirements": {"latency": "20ms", "throughput": "5Mbps", "jitter": "5ms"}
}'

