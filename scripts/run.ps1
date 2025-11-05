param(
    [string]$Class = "DS.Hashmapexample"
)

$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$Root = Resolve-Path "$ScriptDir/.."

# Build
& bash -c "bash '$Root/scripts/build.sh'"

# Run
java -cp "$Root/out" $Class
