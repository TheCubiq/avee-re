.class Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;
.super Ljava/lang/Object;
.source "DummyElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Action3<",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 9

    # vShaderProgram.setUniformMatrix("u_projView", false, DummyElement.this.vpMatTmp.getObj());

    .line 187
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;

    iget-object p3, p3, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v2

    const-string v1, "u_projView"

    const/4 v0, 0x0

    invoke-virtual {p2, v1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformMatrix(Ljava/lang/String;Z[F)V

    # vShaderProgram.setUniformf("u_value1", DummyElement.this.u_value1.getValueAsFloat(renderState.getRes().getMeter()));
    
     # : renderState.getRes().getMeter()
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;
    move-result-object v1
    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;
    move-result-object v1

    # DummyElement.this.u_value1.getValueAsFloat(v1)
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
    # iget-object v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # invoke-virtual {v3, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F
    # move-result v3
    # # vShaderProgram.setUniformf("u_value1", v1);
    # const-string v0, "u_value1"
    # invoke-virtual {p2, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V



    # # vShaderProgram.setUniformf("u_value2", DummyElement.this.u_value2.getValueAsFloat(renderState.getRes().getMeter()));

    # .line 188

    # iget-object v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # invoke-virtual {v3, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F
    # move-result v3
    # const-string v0, "u_value2"
    # invoke-virtual {p2, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V


    # iget-object v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # invoke-virtual {v3, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F
    # move-result v3
    # const-string v0, "u_value3"
    # invoke-virtual {p2, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V


    # iget-object v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # invoke-virtual {v3, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F
    # move-result v3
    # const-string v0, "u_value4"
    # invoke-virtual {p2, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V


    # iget-object v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # invoke-virtual {v3, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F
    # move-result v3
    # const-string v0, "u_value5"
    # invoke-virtual {p2, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V


    # iget-object v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # invoke-virtual {v3, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F
    # move-result v3
    # const-string v0, "u_value6"
    # invoke-virtual {p2, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V


    # for (String propertyName : DummyElement.this.u_values.keySet()) {
    #     String uniformName = "u_" + propertyName;
    #     float value = u_values.get(propertyName).getValueAsFloat(meter);
    #     vShaderProgram.setUniformf(uniformName, value);
    # }

    iget-object v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_values:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :goto_1 # exit loop

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5 # propertyName

    check-cast v5, Ljava/lang/String;

    const-string v6, "u_"

    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;


    move-result-object v6 # uniformName

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-virtual {v7, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v7

    invoke-virtual {p2, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    goto :goto_0
    
    :goto_1


    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 184
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method
