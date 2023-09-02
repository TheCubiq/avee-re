
precision mediump float;
precision mediump int;
precision lowp sampler2D;
precision lowp samplerCube;

//"in" attributes from our vertex shader
//varying vec4 vColor;
varying vec2 vTexCoord;

//declare uniforms
uniform sampler2D u_texture;

uniform sampler2D u_texture2;

// uniform vec2 dirAmount;

uniform vec3 splitColor0;
uniform vec3 splitColor1;
uniform vec3 splitColor2;



vec2 GLCoord2TextureCoord(vec2 glCoord) {
    return glCoord * vec2(1.0, -1.0) / 2.0 + vec2(0.5, 0.5);
}
void main() {

    vec2 dirAmount = vec2(1.0, 0.5);

    vec2 vPosition = (vTexCoord - vec2(0.5, 0.5));
    vPosition.y *= -1.0;

    float b = 1280.0 / 720.0;
    float scale = dirAmount.x; // Set your uniform value here

    float _A = 2.0;
    float _B = 4.0 - b;
    float _F = dirAmount.y;
    float L = length(vec3(vPosition.xy / scale, _F));

    vec2 vMapping = vPosition.xy * _F / L;
    vMapping = vMapping * vec2(_A, _B);

    vMapping = GLCoord2TextureCoord(vMapping / scale);

    vec4 textureColor = texture2D(u_texture, vMapping);

    // vec4 textureColor = texture2D(u_texture, vTexCoord);

    if (vMapping.x > 0.99 || vMapping.x < 0.01 || vMapping.y > 0.99 || vMapping.y < 0.01) {
        textureColor = vec4(0.0, 0.0, 0.0, 1.0);
    }

    // gl_FragColor = textureColor;

    gl_FragColor = textureColor;
}
