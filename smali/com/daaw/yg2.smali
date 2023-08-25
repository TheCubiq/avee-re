.class public final Lcom/daaw/yg2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/zf2;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/daaw/zf2;Lcom/daaw/xg2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yg2;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/yg2;->b:Lcom/daaw/zf2;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/yg2;)Lcom/daaw/zf2;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yg2;->b:Lcom/daaw/zf2;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/yg2;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yg2;->a:Ljava/lang/String;

    return-object p0
.end method
