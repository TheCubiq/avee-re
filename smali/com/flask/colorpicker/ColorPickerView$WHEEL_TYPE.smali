.class public final enum Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;
.super Ljava/lang/Enum;
.source "ColorPickerView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/flask/colorpicker/ColorPickerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "WHEEL_TYPE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

.field public static final enum CIRCLE:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

.field public static final enum FLOWER:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 560
    new-instance v0, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    const/4 v1, 0x0

    const-string v2, "FLOWER"

    invoke-direct {v0, v2, v1}, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->FLOWER:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    new-instance v0, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    const/4 v2, 0x1

    const-string v3, "CIRCLE"

    invoke-direct {v0, v3, v2}, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->CIRCLE:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    .line 559
    sget-object v4, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->FLOWER:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    aput-object v4, v3, v1

    aput-object v0, v3, v2

    sput-object v3, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->$VALUES:[Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 559
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static indexOf(I)Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    .line 569
    sget-object p0, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->FLOWER:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    return-object p0

    .line 567
    :cond_0
    sget-object p0, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->CIRCLE:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    return-object p0

    .line 565
    :cond_1
    sget-object p0, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->FLOWER:Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;
    .locals 1

    .line 559
    const-class v0, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    return-object p0
.end method

.method public static values()[Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;
    .locals 1

    .line 559
    sget-object v0, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->$VALUES:[Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    invoke-virtual {v0}, [Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;

    return-object v0
.end method
