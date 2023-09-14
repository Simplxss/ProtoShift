# ProtoShift

A proto translater tool for a certain anime game.

Some feature are broken due to lake of proto files.

# Build

1. get protos for everywhere.

2. put `cmdid.csv`, `cmdid.json` or `packetIds.json` in `proto\v?.?.?\*`

3. put `protos` in `proto\v?.?.?\proto\*.proto`

4. rename `config.json.example` to `config.json` and edit the `remote.gateserver` and optional `remote.muipserver`.

5. run `generateproto.bat`

6. run `gradlew-jar.bat`

# Run

1. edit `remote` in `config.json`

2. run `start.bat`