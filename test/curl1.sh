curl -X POST http://localhost:8080/location/verify \
  -H "Content-Type: application/json" \
  -d '{
    "deviceId": "device123",
    "latitude": 12.9716,
    "longitude": 77.5946,
    "radius": 500
  }'

