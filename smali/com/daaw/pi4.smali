.class public final Lcom/daaw/pi4;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/qi4;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/qi4;

    invoke-direct {v0}, Lcom/daaw/qi4;-><init>()V

    sput-object v0, Lcom/daaw/pi4;->a:Lcom/daaw/qi4;

    return-void
.end method

.method public static bridge synthetic a()Lcom/daaw/qi4;
    .locals 1

    sget-object v0, Lcom/daaw/pi4;->a:Lcom/daaw/qi4;

    return-object v0
.end method
