.class public final synthetic Lcom/daaw/vx4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jw4;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "MalformedJson"

    iput-object p1, p0, Lcom/daaw/vx4;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vx4;->a:Ljava/lang/String;

    check-cast p1, Lcom/daaw/yx4;

    invoke-interface {p1, v0}, Lcom/daaw/yx4;->zza(Ljava/lang/String;)V

    return-void
.end method
