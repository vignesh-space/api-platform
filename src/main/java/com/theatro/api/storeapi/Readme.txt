TGS will expose API for all the apps supported.

Sample JSON for curbside RnR

{"timeStamp":1514439116161,"transId":"FIT-3e648ef8-b223-4531-ba3d-c5a7d2e7a0ba","storeId":1,"originator":"TCM",
"processInTAG":"true","targetSubSystems":["TGS"],"tgsApiInterface":{"serviceType":"requestResponse",
"service":"clickAndCollectOrderRequest","msgType":"request","clickAndCollectOrderRequest":
{"action":"request","orderId":"100092","orderType":1,"targetGroupId":704,
"playMessage":"/opt/theatro/TheatroLabsIncProgramFiles/tgs/Systemtgs/S3_Audio/3e648ef8-b223-4531-ba3d-c5a7d2e7a0ba.wav",
"locationId":"north bay","buttonId":"south button"}},
"tagApiInterface":{"service":"download","action":"http-get","url":"https://itg0.theatro.com/static_files/nrfdemo/3e648ef8-b223-4531-ba3d-c5a7d2e7a0ba.wav",
"localFilePath":"/opt/theatro/TheatroLabsIncProgramFiles/tgs/Systemtgs/S3_Audio/3e648ef8-b223-4531-ba3d-c5a7d2e7a0ba.wav"}}

Response from TGS will be of below type


{"twCentralNotif":{"version":"1.000000","txId":"1514504732000200288","action":"active","msgTime":1514504732.954187,
"msgType":"event","originator":"TGS","chain":"Theatro","store":"India01","twCentralData":{"event":{"source":"TGS",
"Type":"response","orderid":"100092","originator":"TCM","employeeName":"","employeeId":-1,"status":1,"reasoncode":14}}}}
