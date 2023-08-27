
precision mediump float;
precision mediump int;
precision lowp sampler2D;
precision lowp samplerCube;

//"in" attributes from our vertex shader
varying vec4 vColor;
varying vec2 vTexCoord;

//declare uniforms
uniform sampler2D u_texture;
uniform float blurWH;
//uniform float resolutionH;
uniform vec2 resolution; //used as pixelW/H

void main() {
	vec4 sum = vec4(0.0);


//vIII
//vec2 direction = vec2(blurW, 0.0);
////vec2 resolution = vec2(resolutionH,1.0);
//vec2 uv = vTexCoord;

//  vec4 color = vec4(0.0);
//  vec2 off1 = vec2(1.411764705882353) * direction;
//  vec2 off2 = vec2(3.2941176470588234) * direction;
//  vec2 off3 = vec2(5.176470588235294) * direction;
//  color += texture2D(u_texture, uv) * 0.1964825501511404;
//  color += texture2D(u_texture, uv + (off1 / resolution)) * 0.2969069646728344;
//  color += texture2D(u_texture, uv - (off1 / resolution)) * 0.2969069646728344;
//  color += texture2D(u_texture, uv + (off2 / resolution)) * 0.09447039785044732;
//  color += texture2D(u_texture, uv - (off2 / resolution)) * 0.09447039785044732;
//  color += texture2D(u_texture, uv + (off3 / resolution)) * 0.010381362401148057;
//  color += texture2D(u_texture, uv - (off3 / resolution)) * 0.010381362401148057;
//    gl_FragColor = color;


 //   vec2 pixelDim = vec2(1.0/resolution.x, 1.0/resolution.y);
 // sum += texture2D(u_texture, vTexCoord + (vec2(0.0, 0.0)*blurW)) * 0.25;
 // sum += texture2D(u_texture, vTexCoord + (vec2(pixelDim.x, 0.0)*blurW)) * 0.25;
 // sum += texture2D(u_texture, vTexCoord + (vec2(pixelDim.x, pixelDim.y)*blurW)) * 0.25;
 // sum += texture2D(u_texture, vTexCoord + (vec2(0.0, pixelDim.y)*blurW)) * 0.25;
 //   gl_FragColor = sum;


      //float pixelW = 1.0/resolution.x;
      //float pixelH = 1.0/resolution.y;

        //1.0 -> 0.25
        //0.5 -> 0.125
        //0.25 -> 0.0625

      sum += texture2D(u_texture, vTexCoord + (vec2(-resolution.x, -resolution.y)*blurWH)) * 0.0625;
      sum += texture2D(u_texture, vTexCoord + (vec2(0.0, -resolution.y)*blurWH)) * 0.125;
      sum += texture2D(u_texture, vTexCoord + (vec2(resolution.x, -resolution.y)*blurWH)) * 0.0625;

      sum += texture2D(u_texture, vTexCoord + (vec2(-resolution.x, 0.0)*blurWH)) * 0.125;
      sum += texture2D(u_texture, vTexCoord) * 0.25;
      sum += texture2D(u_texture, vTexCoord + (vec2(resolution.x, 0.0)*blurWH)) * 0.125;

      sum += texture2D(u_texture, vTexCoord + (vec2(-resolution.x, resolution.y)*blurWH)) * 0.0625;
      sum += texture2D(u_texture, vTexCoord + (vec2(0.0, resolution.y)*blurWH)) * 0.125;
      sum += texture2D(u_texture, vTexCoord + (vec2(resolution.x, resolution.y)*blurWH)) * 0.0625;


      gl_FragColor = sum;
}