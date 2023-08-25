.class public Lcom/daaw/wz1;
.super Lcom/daaw/y70;
.source ""


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/y70;-><init>()V

    const-string p1, "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."

    iput-object p1, p0, Lcom/daaw/wz1;->b:Ljava/lang/String;

    return-void
.end method
