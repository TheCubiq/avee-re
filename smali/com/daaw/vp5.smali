.class public final synthetic Lcom/daaw/vp5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# instance fields
.field public final synthetic a:Lcom/daaw/p04;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/p04;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vp5;->a:Lcom/daaw/p04;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vp5;->a:Lcom/daaw/p04;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, p1}, Lcom/daaw/cq5;->n(Lcom/daaw/p04;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    const/4 p1, 0x0

    return-object p1
.end method
