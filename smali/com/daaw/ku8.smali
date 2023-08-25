.class public final synthetic Lcom/daaw/ku8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ty6;


# instance fields
.field public final synthetic p:Lcom/daaw/rv8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/rv8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ku8;->p:Lcom/daaw/rv8;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ku8;->p:Lcom/daaw/rv8;

    check-cast p1, Lcom/daaw/f92;

    invoke-static {v0, p1}, Lcom/daaw/rv8;->q(Lcom/daaw/rv8;Lcom/daaw/f92;)Z

    move-result p1

    return p1
.end method
