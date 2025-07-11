# CAMARA DeviceLocation Spring Boot API

## APIs:
- `POST /location/verify`
- `GET /location/retrieve/{deviceId}`
- `GET /nef/location/{deviceId}`

## Build:
```bash
mvn clean package
```

## Docker:
```bash
docker build -t devicelocation .
```

## Kubernetes:
```bash
kubectl apply -f k8s/
```
