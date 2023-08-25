.class public final Lcom/daaw/nc4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bf5;


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/bb4;

.field public final d:Lcom/daaw/rc4;

.field public final e:Lcom/daaw/nc4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/rc4;Ljava/lang/Long;Ljava/lang/String;Lcom/daaw/mc4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/daaw/nc4;->e:Lcom/daaw/nc4;

    iput-object p1, p0, Lcom/daaw/nc4;->c:Lcom/daaw/bb4;

    iput-object p2, p0, Lcom/daaw/nc4;->d:Lcom/daaw/rc4;

    iput-object p3, p0, Lcom/daaw/nc4;->a:Ljava/lang/Long;

    iput-object p4, p0, Lcom/daaw/nc4;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/lf5;
    .locals 7

    iget-object v0, p0, Lcom/daaw/nc4;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, p0, Lcom/daaw/nc4;->d:Lcom/daaw/rc4;

    invoke-static {v0}, Lcom/daaw/rc4;->a(Lcom/daaw/rc4;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v0}, Lcom/daaw/rc4;->b(Lcom/daaw/rc4;)Lcom/daaw/ef5;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/nc4;->c:Lcom/daaw/bb4;

    iget-object v6, p0, Lcom/daaw/nc4;->b:Ljava/lang/String;

    invoke-static/range {v1 .. v6}, Lcom/daaw/mf5;->a(JLandroid/content/Context;Lcom/daaw/ef5;Lcom/daaw/b94;Ljava/lang/String;)Lcom/daaw/lf5;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Lcom/daaw/pf5;
    .locals 7

    iget-object v0, p0, Lcom/daaw/nc4;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, p0, Lcom/daaw/nc4;->d:Lcom/daaw/rc4;

    invoke-static {v0}, Lcom/daaw/rc4;->a(Lcom/daaw/rc4;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v0}, Lcom/daaw/rc4;->b(Lcom/daaw/rc4;)Lcom/daaw/ef5;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/nc4;->c:Lcom/daaw/bb4;

    iget-object v6, p0, Lcom/daaw/nc4;->b:Ljava/lang/String;

    invoke-static/range {v1 .. v6}, Lcom/daaw/qf5;->a(JLandroid/content/Context;Lcom/daaw/ef5;Lcom/daaw/b94;Ljava/lang/String;)Lcom/daaw/pf5;

    move-result-object v0

    return-object v0
.end method
